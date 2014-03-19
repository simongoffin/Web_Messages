<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage d'un message</title>
    </head>
    <body>
        <%-- Affichage de la chaîne "message" transmise par la servlet --%>
        <p class="info">${ erreur }</p>
        <%-- Puis affichage des données enregistrées dans le bean "messages" transmis par la servlet --%>
        <p>Message : ${ myMessage.message }</p>
    </body>
</html>