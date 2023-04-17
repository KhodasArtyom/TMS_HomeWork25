package by.tms.khodasartyom.homewokr25.config;

import java.nio.file.Path;

public class ShowRepository {

    private final Path directory;

    public ShowRepository(Path directory) {
        this.directory = directory;
    }

    public Path getDirectory() {
        return directory;
    }
}
