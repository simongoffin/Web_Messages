package messages.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import messages.bean.Messages;

public class MyServlet extends HttpServlet {

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /*
         * Récupération des données saisies, envoyées en tant que paramètres de
         * la requête GET générée à la validation du formulaire
         */
        String message = request.getParameter( "myMessage" );
        String erreur;

        /*
         * Initialisation du message à afficher : si un des champs obligatoires
         * du formulaire n'est pas renseigné, alors on affiche un message
         * d'erreur, sinon on affiche un message de succès
         */
        if ( message.trim().isEmpty()) {
            erreur = "Erreur - Vous n'avez pas rempli le champ obligatoire. <br> <a href=\"messages.jsp\">Cliquez ici</a> pour accéder au formulaire de création d'un message.";
        } else {
            erreur = "Message créé avec succès !";
        }
        /*
         * Création du bean Client et initialisation avec les données récupérées
         */
        Messages myMessage = new Messages();
        myMessage.setMessage( message );

        /* Ajout du bean et du message à l'objet requête */
        request.setAttribute( "myMessage", myMessage );
        request.setAttribute( "erreur", erreur );

        /* Transmission à la page JSP en charge de l'affichage des données */
        this.getServletContext().getRequestDispatcher( "/afficherMessages.jsp" ).forward( request, response );
    }
}
