package codes.yassino.databaseapi.model.database.credentials;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MySQLDatabaseCredentials {
    private String user = "admin";
    private String password = "gusosasi123";
    private String database = "database";
    private String host = "localhost";
    private int port = 3306;
}