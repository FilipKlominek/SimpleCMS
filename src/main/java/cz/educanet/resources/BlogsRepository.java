package cz.educanet.resources;

import com.google.gson.Gson;
import cz.educanet.models.Blog;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BlogsRepository {
    public void save() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("blogs.json"));
        BlogsResource blogsResource = new BlogsResource();
        Gson gson = new Gson();
        bw.write(gson.toJson(blogsResource.getAll()));

    }

    public List<Blog> load() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("blogs.json"));
        Gson gson = new Gson();

                        /*
        ArrayList<String> lines = new ArrayList<>();

        String line = br.readLine();
        while (!line.equals("")) {
            lines.add(line);
        }
        StringBuilder allLines = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            allLines.append(lines.get(i));
        }

        return gson.fromJson(allLines);
*/
    }
}
