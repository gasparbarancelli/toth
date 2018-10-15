package br.com.toth.blog;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

/*import java.util.HashMap;
import org.asciidoctor.Asciidoctor;
import static org.asciidoctor.Asciidoctor.Factory.create;*/

@SpringBootApplication
@EnableReactiveMongoRepositories
@EnableMongoAuditing
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	/*
	Asciidoctor asciidoctor = create();
	String html = asciidoctor.convert(
			"= Hello, AsciiDoc!\n" +
					"Doc Writer <doc@example.com>\n" +
					"\n" +
					"An introduction to http://asciidoc.org[AsciiDoc].\n" +
					"\n" +
					"== First Section\n" +
					"\n" +
					"* item 1\n" +
					"* item 2\n" +
					"\n" +
					"[source,ruby]\n" +
					"puts \"Hello, World!\"",
			new HashMap<>());
	System.out.println(html);
	*/
}
