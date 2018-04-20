package wcs.controlleur;

import wcs.Beer;
import wcs.CatchAllBeers;
import wcs.CatchBeerById;
import wcs.Connector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletBeerApiServlet",urlPatterns = {"/beerApi"})
public class ServletBeerApiServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Beer> beers = new ArrayList<>();
        Connector connector = new Connector("https://api.punkapi.com/v2/beers");
        CatchAllBeers catchAllBeers = new CatchAllBeers(connector);
        for(int i =0 ;i < catchAllBeers.getAllBeers().size();i++){
            beers.add(catchAllBeers.getAllBeers().get(i));
        }

        request.setAttribute("beer",beers);
        request.getRequestDispatcher("/beerApi.jsp").forward(request,response);

    }
}
