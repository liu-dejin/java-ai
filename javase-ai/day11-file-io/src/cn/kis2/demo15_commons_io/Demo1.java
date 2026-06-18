package cn.kis2.demo15_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo1 {
    static void main() throws Exception {
        FileUtils.copyFile(new File("day11-file-io/src/cn/kis2/demo15_commons_io/csb.txt"), new File("day11-file-io/src/cn/kis2/newcsb.txt"));

        // Files.copy(Path.of("day11-file-io/src/cn/kis2/demo15_commons_io/csb.txt"), Path.of("day11-file-io/src/cn/kis2/newcsb11.txt"));
        FileUtils.deleteDirectory(new File("C:\\Users\\L\\Pictures\\1 - 副本"));
    }
}
