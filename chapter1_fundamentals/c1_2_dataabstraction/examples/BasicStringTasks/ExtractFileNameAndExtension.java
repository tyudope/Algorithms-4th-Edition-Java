package chapter1_fundamentals.c1_2_dataabstraction.examples.BasicStringTasks;

public class ExtractFileNameAndExtension {
    public static void main(String[] args) {
        String file = "algorithms.java";
        extractFileNameAndExtension(file);
    }

    public static void extractFileNameAndExtension(String file){
        int dotIndex = file.lastIndexOf('.');
        String fileName = file.substring(0 , dotIndex);
        String extensionName = file.substring(dotIndex + 1);
        System.out.println("File name : " + fileName + "  Extension Name : ." + extensionName );
    }
}
