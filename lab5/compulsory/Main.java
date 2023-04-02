package org.lab5.compulsory;

import javax.print.Doc;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Main app = new Main();

        try {
            app.testCreateSave();
            app.testLoad();
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.toString());
        }
    }

    private void testCreateSave() throws IOException {
        Catalog catalog = new Catalog("Documente");
        Document web = new Document("Link web", LocationType.EXTERNAL_URL,
                "https://profs.info.uaic.ro/~acf/java/Cristian_Frasinaru-Curs_practic_de_Java.pdf");
        Document local = new Document("Intern link", LocationType.LOCAL_FILE,
                "D:\\Stef\\Documents\\walls\\1200685.jpg");
        catalog.add(web);
        catalog.add(local);

        CatalogUtil.save(catalog, "D:\\Stef\\OneDrive\\Desktop\\catalog.json");
    }

    private void testLoad() throws InvalidCatalogException, IOException, URISyntaxException {
        Catalog catalog = CatalogUtil.load("D:\\Stef\\OneDrive\\Desktop\\catalog.json");
        List<Document> docs = catalog.getDocuments();
    }
}
