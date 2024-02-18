package lesson8.AbstractClassLesson8.FileCompressionUtility;

public class Main {
    public static void main(String[] args) {
        String inputFile = "filedina.txt"; 
        String zipOutputFile = "zipfile.zip"; 
        String gzipOutputFile = "gzipfile.gz";
        String lzmaOutputFile = "lzmafile.lzma";

        // Test ZIP compression
        ZipAlgorithm zipAlgorithm = new ZipAlgorithm();
        zipAlgorithm.compress(inputFile, zipOutputFile);

        // Test GZip compression
        GZipAlgorithm gzipAlgorithm = new GZipAlgorithm();
        gzipAlgorithm.compress(inputFile, gzipOutputFile);

        // Test LZMA compression
        LZMAAlgorithm lzmaAlgorithm = new LZMAAlgorithm();
        lzmaAlgorithm.compress(inputFile, lzmaOutputFile);
    }
}
