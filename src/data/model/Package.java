package data.model;

public class Package {
    private int packageID;
    private String description;
    private ContactInformation SenderContactInformation;
    private ContactInformation receiverContactInformation;

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContactInformation getSenderContactInformation() {
        return SenderContactInformation;
    }

    public void setSenderContactInformation(ContactInformation senderContactInformation) {
        SenderContactInformation = senderContactInformation;
    }

    public ContactInformation getReceiverContactInformation() {
        return receiverContactInformation;
    }

    public void setReceiverContactInformation(ContactInformation receiverContactInformation) {
        this.receiverContactInformation = receiverContactInformation;
    }
}
