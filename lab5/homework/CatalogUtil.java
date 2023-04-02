package org.lab5.homework;

import freemarker.ext.servlet.FreemarkerServlet;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import org.lab5.compulsory.*;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class CatalogUtil {
    public static void save(Catalog catalog, String path) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(
                new File(path),
                catalog);
    };
    public static Catalog load(String path) throws InvalidCatalogException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Catalog catalog = objectMapper.readValue(
                new File(path),
                Catalog.class);

        return catalog;
    }

    public static void view(Document doc) throws IOException, URISyntaxException {
        Desktop desktop = Desktop.getDesktop();

        if (doc.getType() == LocationType.LOCAL_FILE) {
            desktop.open(new File(doc.getPath()));
        } else {
            desktop.browse(new URI(doc.getPath().toString()));
        }
    }

    public static void list(Catalog catalog) throws IOException, InvalidCatalogException, InvalidDocumentException {
        if(catalog==null){
            Exception ex = new Exception("Catalog is null");
            throw new InvalidCatalogException(ex);
        }
        for(Document doc:catalog.getDocuments()){
            System.out.println(doc);
        }
    }

    public static void report(Catalog catalog) throws IOException, InvalidCatalogException, InvalidDocumentException{
        if(catalog==null){
            Exception ex = new Exception("Catalog is null");
            throw new InvalidCatalogException(ex);
        }
        else{
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);
            cfg.setDirectoryForTemplateLoading(new File("D:\\Stef\\OneDrive\\Desktop\\templates"));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            cfg.setLogTemplateExceptions(false);
            cfg.setWrapUncheckedExceptions(true);
            cfg.setFallbackOnNullLoopVariable(false);
            Template temp=cfg.getTemplate("test.ftlh");
            OutputStream out = new FileOutputStream(new File("D:\\Stef\\OneDrive\\Desktop\\catalog.html"));
            Writer writer = new OutputStreamWriter(out);
            temp.process(catalog,writer);
            Desktop desktop = Desktop.getDesktop();
            File myFile = new File("D:\\Stef\\OneDrive\\Desktop\\catalog.html");
            myFile.createNewFile();
            desktop.open(myFile);
        }
    }
}
