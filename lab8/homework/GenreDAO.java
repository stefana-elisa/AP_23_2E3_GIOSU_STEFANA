package lab8.compulsory;

import java.sql.*;

public class GenreDAO {
    public void create(String name) throws SQLException {
        Connection con = DatabaseUtils.getConnection();
        int genre_id;
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into genres (id, name) values (?, ?)")) {
            genre_id = getMaxId() + 1;
            pstmt.setInt(1, genre_id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        }
    }
    public Integer findByName(String name) throws SQLException {
        Connection con = DatabaseUtils.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select id from genres where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }
    public String findById(int id) throws SQLException {
        Connection con = DatabaseUtils.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select name from genres where id='" + id + "'")) {
            return rs.next() ? rs.getString(1) : null;
        }
    }

    public int getMaxId() {
        Connection con = DatabaseUtils.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select max(id) from genres")) {
            return rs.next() ? rs.getInt(1) : 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
