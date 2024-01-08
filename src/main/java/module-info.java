module com.example.casadossonhos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires javafx.media;
    requires annotations;

    opens com.example.casadossonhos to javafx.fxml;
    exports com.example.casadossonhos;
    exports com.example.casadossonhos.casa;
    opens com.example.casadossonhos.casa to javafx.fxml;
    exports com.example.casadossonhos.casa.entrada.cenas;
    opens com.example.casadossonhos.casa.entrada.cenas to javafx.fxml;
    exports com.example.casadossonhos.casa.CenaAtual;
    opens com.example.casadossonhos.casa.CenaAtual to javafx.fxml;
    exports com.example.casadossonhos.Comandos.alerta;
    opens com.example.casadossonhos.Comandos.alerta to javafx.fxml;
    opens cssArchives.alert;
    opens cssArchives.casa;
}