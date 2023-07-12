package com.mycompany.patrones;

/**
 *
 * @author CltControl
 */
public class ReportBuilder {
    private static ReportBuilder instance;
    
    private String title;
    private String content;
    // Otros atributos del informe
    
    ReportBuilder() {
        // Constructor privado para evitar la creación de instancias externas
    }
    
    public static synchronized ReportBuilder getInstance() {
        if (instance == null) {
            instance = new ReportBuilder();
        }
        return instance;
    }
    
    public ReportBuilder setTitle(String title) {
        this.title = title;
        return this;
    }
    
    public ReportBuilder setContent(String content) {
        this.content = content;
        return this;
    }
    
    // Métodos para configurar otros atributos del informe
    
    public Report build() {
        Report report = new Report();
        report.setTitle(title);
        report.setContent(content);
        // Configurar otros atributos del informe
        
        return report;
    }
}
