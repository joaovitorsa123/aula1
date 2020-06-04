package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class ProgramExe2 {
	public static void main (String[] args) throws ParseException  {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		
		String c1 = sc.nextLine();
		Comment comm1 = new Comment(c1);
		String c2 = sc.nextLine();
		Comment comm2 = new Comment(c2);
		
		sc.nextLine();
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zealand","I'm going to visit this wonderful country! ",
				12);
		
		p1.addComment(comm1);
		p1.addComment(comm2);
		System.out.println(p1);
		
		
		sc.close();
	}

}
