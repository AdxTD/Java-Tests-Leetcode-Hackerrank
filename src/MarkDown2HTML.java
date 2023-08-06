public class MarkDown2HTML {
////////////////////// MAYBE THIS TIME 25 / 1 / 2023
    public static String markDown2Html(String input){
        String html = "";
        String[] lines = input.split("\n");
        boolean bulletsOpened = false, paragraphOpened = false;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            if(line.isEmpty()){
                if(paragraphOpened){
                    paragraphOpened = false;
                    html+="</p>\n";
                }
                if(bulletsOpened){
                    bulletsOpened = false;
                    html += "</ul>\n";
                }
                continue;
            }
            if(line.startsWith("  * ")){
                if(!bulletsOpened){
                    bulletsOpened = true;
                    html += "<ul>\n";
                }
                html += "<li>" + line.substring(4,line.length()) + "</li>\n";
                continue;
            }
            if(bulletsOpened){
                bulletsOpened = false;
                html += "</ul>\n";
            }
            if(line.startsWith("# ")){
                html += "<h1>" + line.substring(2,line.length()) + "</h1>\n";
                continue;
            }
            if(line.startsWith("## ")){
                html += "<h2>" + line.substring(3,line.length()) + "</h2>\n";
                continue;
            }

            if(!paragraphOpened){
                paragraphOpened = true;
                html += "<p>";
            }
            if(line.split("_").length > 1){
                String[] parts = line.split("_");
                System.out.println("Debug: italics parts size: " + parts.length +
                ", and values are: 0-" + parts[0] +" 1-" +parts[1] );
                if(parts.length > 2) System.out.println(" 2-" + parts[2]);
                for (int j = 0; j < parts.length; j++) {
                    if(j % 2 == 0) html+= parts[j];
                    else html += "<em>" + parts[j] + "</em>";
                }
                continue;
            }
            if(line.split("\\*\\*").length > 1){
                String[] parts = line.split("**");
                for (int j = 0; j < parts.length; j++) {
                    if(j % 2 == 0) html+= parts[j];
                    else html += "<strong>" + parts[j] + "</strong>";
                }
                continue;
            }
            html += line;
        }

        if(bulletsOpened){
            bulletsOpened = false;
            html += "</ul>\n";
        }

        if(paragraphOpened){
            paragraphOpened = false;
            html+="</p>\n";
        }

        return html;
    }


}