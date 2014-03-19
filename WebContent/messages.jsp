<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création d'un message</title>
    </head>
    <body>
        <div>
            <form method="get" action="messages">
                <fieldset>
                    <legend>Information message</legend>
    
                    <label for="myMessage">Message <span class="requis">*</span></label>
                    <input type="text" id="myMessage" name="myMessage" value="" size="20" maxlength="20" />
                    <br />
                    
                </fieldset>
                <input type="submit" value="Valider"  />
                <input type="reset" value="Remettre à zéro" /> <br />
            </form>
        </div>
    </body>
</html>