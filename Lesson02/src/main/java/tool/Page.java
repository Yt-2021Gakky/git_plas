package tool;

import java.io.PrintWriter;

public class Page {
	//Pageフィルタを使ってHTML部を簡略化

	public static void header(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Servlet/JSP Sample Programs</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("ここはフィルタを使って出力したHTML部分<<br><br>");
	}

	public static void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}
}
