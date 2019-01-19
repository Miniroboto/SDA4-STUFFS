package utils;

public enum ServerStatus {
ON ("ON"),
OFF ("OFF");

public String status;

ServerStatus(String status) {
    this.status=status;
}

public String getServStatus() {
    return status;
}



}
