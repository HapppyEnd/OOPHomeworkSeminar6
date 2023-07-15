public class Homework {
    public static void main(String[] args) {

        Document doc = new Document("1234", "asdad");
        ConverJSON converJSON = new ConverJSON();
        ConvertHTML convertHTML = new ConvertHTML();

        Report reportJSON = new ReportEntrypoint().create(doc, converJSON);
        Report reportHTML = new ReportEntrypoint().create(doc, convertHTML);

        System.out.println(reportJSON);
        System.out.println(reportHTML);
    }
}