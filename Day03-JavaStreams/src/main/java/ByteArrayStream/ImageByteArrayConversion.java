package ByteArrayStream;

import java.io.*;

public class ImageByteArrayConversion {
    public static void main(String[] args) {
        String sourceImage = "src/main/java/ByteArrayStream/source_image.PNG";
        String destinationImage = "src/main/java/ByteArrayStream/destination_image.jpg";

        try {
            // Read the image file into a byte array
            byte[] imageBytes = readImageToByteArray(sourceImage);

            // Write the byte array to a new image file
            writeByteArrayToImage(imageBytes, destinationImage);

            System.out.println("Image conversion successful. The new image is identical to the original.");
        } catch (IOException e) {
            System.out.println("Error during image conversion: " + e.getMessage());
        }
    }

    public static byte[] readImageToByteArray(String imagePath) throws IOException {
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;

        try {
            fis = new FileInputStream(imagePath);
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (baos != null) {
                baos.close();
            }
        }
    }

    public static void writeByteArrayToImage(byte[] imageBytes, String destinationPath) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream(destinationPath);

        int byteData;
        while ((byteData = bais.read()) != -1) {
            fos.write(byteData);
        }

        fos.close();
        bais.close();
    }
}

