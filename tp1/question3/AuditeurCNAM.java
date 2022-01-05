package question3;

/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author � compl�ter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;
    private String n ;
    private String p ;
    private String lowern;
    private String lowerp;
    private String replace1n;
    private String replace1p;
    private String replace2n;
    private String replace2p;
    private String replace3n;
    private String replace3p;
    private String replace4n;
    private String replace4p;
    private String replace5n;
    private String replace5p;
    private String replace6n;
    private String replace6p;
    private String replace7n;
    private String replace7p;
    private String replace8n;
    private String replace8p;
    private String replace9n;
    private String replace9p;
    private String replace10n;
    private String replace10p;
    private String replace11n;
    private String replace11p;
    private String replace12n;
    private String replace12p;
    private String replace13n;
    private String replace13p;
    private String replace14n;
    private String replace14p;
    private String replace15n;
    private String replace15p;
    private String replace16n;
    private String replace16p;
    private String replace17n;
    private String replace17p;
    

    /**
     * "Cr�ation", le constructeur d'un auditeur avec son nom, son pr�nom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son pr�nom
     * @param matricule
     *            sur la carte d'inscription, pr�s de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premi�res lettres du nom suivies de la premi�re
     * lettre du pr�nom s�par�es de '_' . le login retourn� est en minuscules,
     * le trait d'union, ou sp�ciaux <i>(pour unix)</i> sont remplac�s par des
     * '_' pas de caract�res accentu�s pour le login voir les classes
     * pr�d�fines, java.lang.String : les m�thodes replaceAll, toLowerCase et
     * substring java.lang.Math : la m�thode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifi�, sans les adaptations dues aux
     *         homonymes...
     */
    public String login() {
      if(nom.length()<=6){
            n=nom;
        }else {
        n=nom.substring(0,5);
    }
    if(prenom.length() <=1){
        p=prenom;
    }
    else {
         p=prenom.substring(0,1);
    }

        lowern=n.toLowerCase();
        lowerp=p.toLowerCase();
        replace1n=lowern.replaceAll("-","_");
        replace1p=lowerp.replaceAll("-","_");
        replace2n=replace1n.replaceAll("�","e");
        replace2p=replace1p.replaceAll("�","e");
        replace3n=replace2n.replaceAll("�","e");
        replace3p=replace2p.replaceAll("�","e");
        replace4n=replace3n.replaceAll("�","a");
        replace4p=replace3p.replaceAll("�","a");
        replace5n=replace4n.replaceAll("�","e");
        replace5p=replace4p.replaceAll("�","e");
        replace6n=replace5n.replaceAll("�","a");
        replace6p=replace5p.replaceAll("�","a");
        replace7n=replace6n.replaceAll("�","a");
        replace7p=replace6p.replaceAll("�","a");
        replace8n=replace7n.replaceAll("�","ae");
        replace8p=replace7p.replaceAll("�","ae");
        replace9n=replace8n.replaceAll("�","c");
        replace9p=replace8p.replaceAll("�","c");
        replace10n=replace9n.replaceAll("�","i");
        replace10p=replace9p.replaceAll("�","i");
        replace11n=replace10n.replaceAll("�","e");
        replace11p=replace10p.replaceAll("�","e");
        replace12n=replace11n.replaceAll("�","i");
        replace12p=replace11p.replaceAll("�","i");
        replace13n=replace12n.replaceAll("�","o");
        replace13p=replace12p.replaceAll("�","o");
        replace14n=replace13n.replaceAll("�","oe");
        replace14p=replace13p.replaceAll("�","oe");
        replace15n=replace14n.replaceAll("�","u");
        replace15p=replace14p.replaceAll("�","u");
        replace16n=replace15n.replaceAll("�","u");
        replace16p=replace15p.replaceAll("�","u");
        replace17n=replace16n.replaceAll("�","u");
        replace17p=replace16p.replaceAll("�","u");
        
        return replace17n + "_" + replace17p ;
      // return nom + "_" + prenom ;
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return nom;// � compl�ter
    }

    /**
     * Lecture du pr�nom de l'auditeur.
     * 
     * @return son pr�nom
     */
    public String prenom() {
        return prenom;// � compl�ter
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return matricule;// � compl�ter
    }

    /**
     * m�thode toString ( m�thode red�finie de la classe Object).
     * 
     * @return la concat�nation du nom, du pr�nom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
