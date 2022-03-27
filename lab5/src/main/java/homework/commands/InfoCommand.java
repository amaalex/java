//package homework.commands;
//import java.io.File;
//import java.io.FileInputStream;
//
//import org.apache.tika.exception.TikaException;
//import org.apache.tika.metadata.Metadata;
//import org.apache.tika.parser.AutoDetectParser;
//import org.apache.tika.sax.BodyContentHandler;
//import org.xml.sax.SAXException;
//
//public class InfoCommand{
//    public void displayMetadata(File file){
//
//        Parser parser = new AutoDetectParser();
//        BodyContentHandler handler = new BodyContentHandler();
//        Metadata metadata = new Metadata();
//        FileInputStream inputStream = new FileInputStream(file);
//        ParseContext context = new ParseContext();
//        parser.parser(inputStream, handler, metadata, context);
//        String[] metadataNames = metadataNames();
//        for (String name : metadataNames){
//            System.out.println(name + " " + metadata.get(name));
//        }
//    }
//}
