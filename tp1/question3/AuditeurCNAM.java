package question3;

/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author à compléter
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
     * "Création", le constructeur d'un auditeur avec son nom, son prénom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son prénom
     * @param matricule
     *            sur la carte d'inscription, près de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premières lettres du nom suivies de la première
     * lettre du prénom séparées de '_' . le login retourné est en minuscules,
     * le trait d'union, ou spéciaux <i>(pour unix)</i> sont remplacés par des
     * '_' pas de caractères accentués pour le login voir les classes
     * prédéfines, java.lang.String : les méthodes replaceAll, toLowerCase et
     * substring java.lang.Math : la méthode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifié, sans les adaptations dues aux
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
        replace2n=replace1n.replaceAll("é","e");
        replace2p=replace1p.replaceAll("é","e");
        replace3n=replace2n.replaceAll("è","e");
        replace3p=replace2p.replaceAll("è","e");
        replace4n=replace3n.replaceAll("à","a");
        replace4p=replace3p.replaceAll("à","a");
        replace5n=replace4n.replaceAll("ê","e");
        replace5p=replace4p.replaceAll("ê","e");
        replace6n=replace5n.replaceAll("â","a");
        replace6p=replace5p.replaceAll("â","a");
        replace7n=replace6n.replaceAll("ä","a");
        replace7p=replace6p.replaceAll("ä","a");
        replace8n=replace7n.replaceAll("æ","ae");
        replace8p=replace7p.replaceAll("æ","ae");
        replace9n=replace8n.replaceAll("ç","c");
        replace9p=replace8p.replaceAll("ç","c");
        replace10n=replace9n.replaceAll("î","i");
        replace10p=replace9p.replaceAll("î","i");
        replace11n=replace10n.replaceAll("ë","e");
        replace11p=replace10p.replaceAll("ë","e");
        replace12n=replace11n.replaceAll("ï","i");
        replace12p=replace11p.replaceAll("ï","i");
        replace13n=replace12n.replaceAll("ô","o");
        replace13p=replace12p.replaceAll("ô","o");
        replace14n=replace13n.replaceAll("œ","oe");
        replace14p=replace13p.replaceAll("œ","oe");
        replace15n=replace14n.replaceAll("ù","u");
        replace15p=replace14p.replaceAll("ù","u");
        replace16n=replace15n.replaceAll("û","u");
        replace16p=replace15p.replaceAll("û","u");
        replace17n=replace16n.replaceAll("ü","u");
        replace17p=replace16p.replaceAll("ü","u");
        
        return replace17n + "_" + replace17p ;
      // return nom + "_" + prenom ;
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return nom;// à compléter
    }

    /**
     * Lecture du prénom de l'auditeur.
     * 
     * @return son prénom
     */
    public String prenom() {
        return prenom;// à compléter
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return matricule;// à compléter
    }

    /**
     * méthode toString ( méthode redéfinie de la classe Object).
     * 
     * @return la concaténation du nom, du prénom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
