import zoe.Task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
public class Saver {
    protected ArrayList<Task> tasks;
    Saver(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void saveTo(String path) {
        File file = new File(path, "SavedTasks.txt");

        try {
            File directory = file.getParentFile();
            //check for existence of directory
            if (!directory.exists()) {
                directory.mkdirs();
            }

            //create the "save" file if it does not exist
            if(!file.exists()) {
                file.createNewFile();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));

            for (Task t: tasks) {
                writer.write(t.saveTask() + "\n");
            }

            writer.write("EOF");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
