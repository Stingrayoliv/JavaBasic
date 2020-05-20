package Lesson020;

/**
 * FirstProject
 * 5/20/20 12: 56
 */
public class HelloString190301 {
    //The web is built with HTML strings like "Yay" which draws Yay as italic text. In this example, the "i" tag makes
    // and which surround the word "Yay". Given tag and word strings, create the HTML string with tags around
    // the word, e.g. "Yay".
    public static String makeTags(String htmlTag, String content) {
        char startTag = '<';
        char slashTag = '/';
        char endTag = '>';
        String startHtmlTag = startTag + htmlTag + endTag;
        String endHtmlTag = startTag + htmlTag + slashTag + endTag;
        String result = startHtmlTag + content + endHtmlTag;
        //String result = "" + startTag + htmlTag + endTag + content + startTag + htmlTag + slashTag + endTag;
        return result;
    }

}
