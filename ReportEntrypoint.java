public class ReportEntrypoint {

    public Report create(Document document, Operation reportType) {
        return new Report(reportType.convert(document));
    }
}