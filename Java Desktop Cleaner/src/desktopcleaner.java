import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class desktopcleaner {

    public static void main(String[] args) {
        // Define source and destination directories
        String sourceDir = ""; // Set your source directory path here
        String destDirSFX = ""; // Set your SFX destination directory path here
        String destDirMusic = ""; // Set your music destination directory path here
        String destDirVideo = ""; // Set your video destination directory path here
        String destDirImage = ""; // Set your image destination directory path here
        String destDirDocuments = ""; // Set your documents destination directory path here

        // List files in the source directory and move them to appropriate folders
        File sourceDirectory = new File(sourceDir);
        File[] files = sourceDirectory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    String fileExtension = getFileExtension(fileName);

                    if (isAudioFile(fileExtension)) {
                        String destDir = (file.length() < 10_000_000 || fileName.contains("SFX")) ? destDirSFX : destDirMusic;
                        moveFile(file, destDir);
                    } else if (isVideoFile(fileExtension)) {
                        moveFile(file, destDirVideo);
                    } else if (isImageFile(fileExtension)) {
                        moveFile(file, destDirImage);
                    } else if (isDocumentFile(fileExtension)) {
                        moveFile(file, destDirDocuments);
                    }
                }
            }
        }

        System.out.println("Desktop cleaned successfully!");
    }

    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf(".");
        if (lastDotIndex != -1) {
            return fileName.substring(lastDotIndex).toLowerCase();
        }
        return "";
    }

    private static void moveFile(File sourceFile, String destinationDirectory) {
        try {
            Path sourcePath = sourceFile.toPath();
            Path destinationPath = new File(destinationDirectory, sourceFile.getName()).toPath();
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Moved file: " + sourceFile.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isAudioFile(String extension) {
        String[] audioExtensions = { ".m4a", ".flac", ".mp3", ".wav", ".wma", ".aac" };
        for (String ext : audioExtensions) {
            if (extension.equals(ext)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isVideoFile(String extension) {
        String[] videoExtensions = { ".webm", ".mpg", ".mp4", ".avi", ".mov" };
        for (String ext : videoExtensions) {
            if (extension.equals(ext)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isImageFile(String extension) {
        String[] imageExtensions = { ".jpg", ".jpeg", ".png", ".gif", ".bmp" };
        for (String ext : imageExtensions) {
            if (extension.equals(ext)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDocumentFile(String extension) {
        String[] documentExtensions = { ".pdf", ".doc", ".docx", ".txt" };
        for (String ext : documentExtensions) {
            if (extension.equals(ext)) {
                return true;
            }
        }
        return false;
    }
}
