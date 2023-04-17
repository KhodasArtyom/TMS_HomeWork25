package by.tms.khodasartyom.homewokr25.config;

import java.nio.file.Path;

public class DirectoryProperties {

    private final Path directory;

    public DirectoryProperties(Path directory) {
        this.directory = directory;
    }

    public Path getDirectory() {
        return directory;
    }
}
