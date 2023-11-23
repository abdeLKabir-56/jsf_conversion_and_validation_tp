import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Client {
	
    String civilite;
    String nom;
    String prenom;
    int cp;
    String ville;
    Date dateN;
    String mail;
    int tel;
    List<Client> listClient = new ArrayList<Client>();
    
    public List<Client> getListClient() {
		return listClient;
	}
    
    public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}
    
    public Client() {
    	super();
    }
    
    public Client(String civilite, String nom, String prenom, int cp, String ville, Date dateN, String mail, int tel) {
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.cp = cp;
        this.ville = ville;
        this.dateN = dateN;
        this.mail = mail;
        this.tel = tel;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }

    public Date getDateN() {
        return dateN;
    }

    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
public void save() {
		
		Client cl = new Client();
		
		cl.setCivilite(civilite);
		cl.setNom(nom);
		cl.setPrenom(prenom);
		cl.setCp(cp);
		cl.setVille(ville);
		cl.setDateN(dateN);
		cl.setMail(mail);
		cl.setTel(tel);
		listClient.add(cl);
		
		
		//global error message
//		FacesContext.getCurrentInstance().addMessage(
//                null,
//                new FacesMessage(FacesMessage.SEVERITY_ERROR,
//                        "Please select a path first", "title"));
//
//			FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds()
//			.add("globalMessage");
		
		
}

}
