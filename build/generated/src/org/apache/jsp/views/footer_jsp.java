package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import pk.models.Produit;
import org.hibernate.Query;
import pk.dao.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Hibernate;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"tt-footer-default tt-color-scheme-02\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12 col-md-9\">\n");
      out.write("                            <div class=\"tt-newsletter-layout-01\">\n");
      out.write("                                <div class=\"tt-newsletter\">\n");
      out.write("                                    <div class=\"tt-mobile-collapse\">\n");
      out.write("                                        <h4 class=\"tt-collapse-title\">\n");
      out.write("                                            BE IN TOUCH WITH US:\n");
      out.write("                                        </h4>\n");
      out.write("                                        <div class=\"tt-collapse-content\">\n");
      out.write("                                            <form id=\"newsletterform\" class=\"form-inline form-default\" method=\"post\" novalidate=\"novalidate\" action=\"#\">\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("                                                    <input type=\"text\" name=\"email\" class=\"form-control\" placeholder=\"Enter your e-mail\">\n");
      out.write("                                                    <button type=\"submit\" class=\"btn\">JOIN US</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-auto\">\n");
      out.write("                            <ul class=\"tt-social-icon\">\n");
      out.write("                                <li><a class=\"icon-g-64\" target=\"_blank\" href=\"http://www.facebook.com/\"></a></li>\n");
      out.write("                                <li><a class=\"icon-h-58\" target=\"_blank\" href=\"http://www.facebook.com/\"></a></li>\n");
      out.write("                                <li><a class=\"icon-g-66\" target=\"_blank\" href=\"http://www.twitter.com/\"></a></li>\n");
      out.write("                                <li><a class=\"icon-g-67\" target=\"_blank\" href=\"http://www.google.com/\"></a></li>\n");
      out.write("                                <li><a class=\"icon-g-70\" target=\"_blank\" href=\"https://instagram.com/\"></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"tt-footer-col tt-color-scheme-01\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-lg-2 col-xl-3\">\n");
      out.write("                            <div class=\"tt-mobile-collapse\">\n");
      out.write("                                <h4 class=\"tt-collapse-title\">\n");
      out.write("                                    CATEGORIES\n");
      out.write("                                </h4>\n");
      out.write("                                <div class=\"tt-collapse-content\">\n");
      out.write("                                    <ul class=\"tt-list\">\n");
      out.write("                                        <li><a href=\"listing-collection.html\">Women</a></li>\n");
      out.write("                                        <li><a href=\"listing-collection.html\">Men</a></li>\n");
      out.write("                                        <li><a href=\"listing-collection.html\">Accessories</a></li>\n");
      out.write("                                        <li><a href=\"listing-collection.html\">Shoes</a></li>\n");
      out.write("                                        <li><a href=\"listing-collection.html\">New Arrivals</a></li>\n");
      out.write("                                        <li><a href=\"listing-collection.html\">Clearence</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-2 col-xl-3\">\n");
      out.write("                            <div class=\"tt-mobile-collapse\">\n");
      out.write("                                <h4 class=\"tt-collapse-title\">\n");
      out.write("                                    MY ACCOUNT\n");
      out.write("                                </h4>\n");
      out.write("                                <div class=\"tt-collapse-content\">\n");
      out.write("                                    <ul class=\"tt-list\">\n");
      out.write("                                        <li><a href=\"account_order.html\">Orders</a></li>\n");
      out.write("                                        <li><a href=\"page404.html\">Compare</a></li>\n");
      out.write("                                        <li><a href=\"page404.html\">Wishlist</a></li>\n");
      out.write("                                        <li><a href=\"login.html\">Log In</a></li>\n");
      out.write("                                        <li><a href=\"create-account.html\">Register</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-4 col-xl-3\">\n");
      out.write("                            <div class=\"tt-mobile-collapse\">\n");
      out.write("                                <h4 class=\"tt-collapse-title\">\n");
      out.write("                                    ABOUT\n");
      out.write("                                </h4>\n");
      out.write("                                <div class=\"tt-collapse-content\">\n");
      out.write("                                    <p>\n");
      out.write("                                        Lorem ipsum dolor sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore. Lorem ipsum dolor sit amet conse ctetur adipisicing elit, seddo eiusmod tempor incididunt ut labore etdolore.\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-4 col-xl-3\">\n");
      out.write("                            <div class=\"tt-newsletter\">\n");
      out.write("                                <div class=\"tt-mobile-collapse\">\n");
      out.write("                                    <h4 class=\"tt-collapse-title\">\n");
      out.write("                                        CONTACTS\n");
      out.write("                                    </h4>\n");
      out.write("                                    <div class=\"tt-collapse-content\">\n");
      out.write("                                        <address>\n");
      out.write("                                            <p><span>Address:</span> ISTA Ntic2 ofpppt , Marocco casablanca</p>\n");
      out.write("                                            <p><span>Phone:</span> +212 6005 70107</p>\n");
      out.write("                                            <p><span>Hours:</span> 7 Days a week from 10 am to 6 pm</p>\n");
      out.write("                                            <p><span>E-mail:</span> <a href=\"saad.sabir.ss@gmail.com\">saad.sabir.ss@gmail.com</a></p>\n");
      out.write("                                        </address>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"tt-footer-custom\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"tt-row\">\n");
      out.write("                        <div class=\"tt-col-left\">\n");
      out.write("                            <div class=\"tt-col-item tt-logo-col\">\n");
      out.write("                                <!-- logo -->\n");
      out.write("                                <a class=\"tt-logo tt-logo-alignment\" href=\"index.html\">\n");
      out.write("                                    <img  src=\"/Store/images/custom/logo.png\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("                                <!-- /logo -->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tt-col-item\">\n");
      out.write("                                <!-- copyright -->\n");
      out.write("                                <div class=\"tt-box-copyright\">\n");
      out.write("                                    &copy; Saad 2021. All Rights Reserved\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /copyright -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tt-col-right\">\n");
      out.write("                            <div class=\"tt-col-item\">\n");
      out.write("                                <!-- payment-list -->\n");
      out.write("                                <ul class=\"tt-payment-list\">\n");
      out.write("                                    <li><a href=\"page404.html\"><span class=\"icon-Stripe\"><span class=\"path1\"></span><span class=\"path2\"></span><span class=\"path3\"></span><span class=\"path4\"></span><span class=\"path5\"></span><span class=\"path6\"></span><span class=\"path7\"></span><span class=\"path8\"></span><span class=\"path9\"></span><span class=\"path10\"></span><span class=\"path11\"></span><span class=\"path12\"></span>\n");
      out.write("                                            </span></a></li>\n");
      out.write("                                    <li><a href=\"page404.html\"> <span class=\"icon-paypal-2\">\n");
      out.write("                                                <span class=\"path1\"></span><span class=\"path2\"></span><span class=\"path3\"></span><span class=\"path4\"></span><span class=\"path5\"></span><span class=\"path6\"></span>\n");
      out.write("                                            </span></a></li>\n");
      out.write("                                    <li><a href=\"page404.html\"><span class=\"icon-visa\">\n");
      out.write("                                                <span class=\"path1\"></span><span class=\"path2\"></span><span class=\"path3\"></span><span class=\"path4\"></span><span class=\"path5\"></span>\n");
      out.write("                                            </span></a></li>\n");
      out.write("                                    <li><a href=\"page404.html\"><span class=\"icon-mastercard\">\n");
      out.write("                                                <span class=\"path1\"></span><span class=\"path2\"></span><span class=\"path3\"></span><span class=\"path4\"></span><span class=\"path5\"></span><span class=\"path6\"></span><span class=\"path7\"></span><span class=\"path8\"></span><span class=\"path9\"></span><span class=\"path10\"></span><span class=\"path11\"></span><span class=\"path12\"></span><span class=\"path13\"></span>\n");
      out.write("                                            </span></a></li>\n");
      out.write("                                    <li><a href=\"page404.html\"><span class=\"icon-discover\">\n");
      out.write("                                                <span class=\"path1\"></span><span class=\"path2\"></span><span class=\"path3\"></span><span class=\"path4\"></span><span class=\"path5\"></span><span class=\"path6\"></span><span class=\"path7\"></span><span class=\"path8\"></span><span class=\"path9\"></span><span class=\"path10\"></span><span class=\"path11\"></span><span class=\"path12\"></span><span class=\"path13\"></span><span class=\"path14\"></span><span class=\"path15\"></span><span class=\"path16\"></span>\n");
      out.write("                                            </span></a></li>\n");
      out.write("                                    <li><a href=\"page404.html\"><span class=\"icon-american-express\">\n");
      out.write("                                                <span class=\"path1\"></span><span class=\"path2\"></span><span class=\"path3\"></span><span class=\"path4\"></span><span class=\"path5\"></span><span class=\"path6\"></span><span class=\"path7\"></span><span class=\"path8\"></span><span class=\"path9\"></span><span class=\"path10\"></span><span class=\"path11\"></span>\n");
      out.write("                                            </span></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <!-- /payment-list -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <a href=\"#\" class=\"tt-back-to-top\">BACK TO TOP</a>\n");
      out.write("        <!-- modal (AddToCartProduct) -->\n");
      out.write("        <div class=\"modal  fade\"  id=\"modalAddToCartProduct\" tabindex=\"-1\" role=\"dialog\" aria-label=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content \">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><span class=\"icon icon-clear\"></span></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"tt-modal-addtocart mobile\">\n");
      out.write("                            <div class=\"tt-modal-messages\">\n");
      out.write("                                <i class=\"icon-f-68\"></i> Added to cart successfully!\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\" class=\"btn-link btn-close-popup\">CONTINUE SHOPPING</a>\n");
      out.write("                            <a href=\"shopping_cart_02.html\" class=\"btn-link\">VIEW CART</a>\n");
      out.write("                            <a href=\"page404.html\" class=\"btn-link\">PROCEED TO CHECKOUT</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tt-modal-addtocart desctope\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-12 col-lg-6\">\n");
      out.write("                                    <div class=\"tt-modal-messages\">\n");
      out.write("                                        <i class=\"icon-f-68\"></i> Added to cart successfully!\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"tt-modal-product\">\n");
      out.write("                                        <div class=\"tt-img\">\n");
      out.write("                                            <img src=\"/Store/images/loader.svg\" data-src=\"/Store/images/product/product-01.jpg\" alt=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <h2 class=\"tt-title\"><a href=\"product.html\">Flared Shift Dress</a></h2>\n");
      out.write("                                        <div class=\"tt-qty\">\n");
      out.write("                                            QTY: <span>1</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"tt-product-total\">\n");
      out.write("                                        <div class=\"tt-total\">\n");
      out.write("                                            TOTAL: <span class=\"tt-price\">$324</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12 col-lg-6\">\n");
      out.write("                                    <a href=\"#\" class=\"tt-cart-total\">\n");
      out.write("                                        There are 1 items in your cart\n");
      out.write("                                        <div class=\"tt-total\">\n");
      out.write("                                            TOTAL: <span class=\"tt-price\">$324</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-border btn-close-popup\">CONTINUE SHOPPING</a>\n");
      out.write("                                    <a href=\"shopping_cart_02.html\" class=\"btn btn-border\">VIEW CART</a>\n");
      out.write("                                    <a href=\"#\" class=\"btn\">PROCEED TO CHECKOUT</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- modal (quickViewModal) -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"modal  fade\"  id=\"quickView\" tabindex=\"-1\" role=\"dialog\" aria-label=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\n");
      out.write("            <div class=\"modal-dialog modal-lg\">\n");
      out.write("                <div class=\"modal-content \">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><span class=\"icon icon-clear\"></span></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <div class=\"tt-modal-quickview desctope\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-12 col-md-5 col-lg-6\">\n");
      out.write("                                    <div class=\"tt-mobile-product-slider arrow-location-center\">\n");
      out.write("                                        <div><img   alt=\"\" id=\"url\"></div>\n");
      out.write("                                        <div><img  alt=\"\" id=\"url2\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-12 col-md-7 col-lg-6\">\n");
      out.write("                                    <div class=\"tt-product-single-info\">\n");
      out.write("                                        <div class=\"tt-add-info\">\n");
      out.write("                                            <ul>\n");
      out.write("\n");
      out.write("                                                <li>Id:<span id=\"idp\"></span></li>\n");
      out.write("                                                <li>Brand:<span id=\"marque\"></span></li>\n");
      out.write("                                                <li >Availability:<span id=\"qtestock\"></span>in Stock</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h2 class=\"tt-title\" id=\"libelle\"></h2>\n");
      out.write("                                        <div class=\"tt-title-options\" id=\"categorie\"></div>\n");
      out.write("                                        <div class=\"tt-price\">\n");
      out.write("                                            <span class=\"new-price\" id=\"prix\"></span>$\n");
      out.write("                                            <span class=\"old-price\"></span>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"tt-wrapper\" id=\"description\">\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        ");


                                            Session s = HibernateUtil.getSession();
                                            if (request.getParameter("idp") != null) {
                                                int idp = Integer.parseInt(request.getParameter("idp"));
                                                Produit p = (Produit) s.get(Produit.class, idp);

                                        
      out.write("\n");
      out.write("                                        <div class=\"tt-wrapper\">\n");
      out.write("                                            <div class=\"tt-row-custom-01\">\n");
      out.write("                                                <div class=\"col-item\">\n");
      out.write("                                                    <div class=\"tt-input-counter style-01\">\n");
      out.write("                                                        <span class=\"minus-btn\"></span>\n");
      out.write("                                                        <input type=\"text\" value=\"1\" size=\"5\">\n");
      out.write("                                                        <span class=\"plus-btn\"></span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-item\">\n");
      out.write("                                                    <a href=\"/Store/GererPanier?action=ajouter&idp=");
      out.print(p.getIdp());
      out.write("&qte=1\" class=\"btn btn-lg\"><i class=\"icon-f-39\"></i>ADD TO CART</a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- modalVideoProduct -->\n");
      out.write("        <div class=\"modal fade\"  id=\"modalVideoProduct\" tabindex=\"-1\" role=\"dialog\" aria-label=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-video\">\n");
      out.write("                <div class=\"modal-content \">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><span class=\"icon icon-clear\"></span></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"modal-video-content\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- modal (ModalSubsribeGood) -->\n");
      out.write("        <div class=\"modal  fade\"  id=\"ModalSubsribeGood\" tabindex=\"-1\" role=\"dialog\" aria-label=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-xs\">\n");
      out.write("                <div class=\"modal-content \">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><span class=\"icon icon-clear\"></span></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"tt-modal-subsribe-good\">\n");
      out.write("                            <i class=\"icon-f-68\"></i> You have successfully signed!\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- ModalCommade -->\n");
      out.write("\n");
      out.write("        <!-- Modal (newsletter) --\n");
      out.write("        >\n");
      out.write("        <!--\n");
      out.write("        <div class=\"modal  fade\"  id=\"Modalnewsletter\" tabindex=\"-1\" role=\"dialog\" aria-label=\"myModalLabel\" aria-hidden=\"true\"  data-pause=2000>\n");
      out.write("                <div class=\"modal-dialog modal-sm\">\n");
      out.write("                        <div class=\"modal-content \">\n");
      out.write("                                <div class=\"modal-header\">\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"><span class=\"icon icon-clear\"></span></button>\n");
      out.write("                                </div>\n");
      out.write("                                <form>\n");
      out.write("                                        <div class=\"modal-body no-background\">\n");
      out.write("                                                <div class=\"tt-modal-newsletter\">\n");
      out.write("                                                        <div class=\"tt-modal-newsletter-promo\">\n");
      out.write("                                                                <div class=\"tt-title-small\">BE THE FIRST<br> TO KNOW ABOUT</div>\n");
      out.write("                                                                <div class=\"tt-title-large\">S-Store</div>\n");
      out.write("                                                                <p>\n");
      out.write("                                                                        MADE WITH ❤️ BY SAAD EL GHANEMY\n");
      out.write("                                                                </p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <p>\n");
      out.write("                                                                By subscribe, you accept the terms &amp; privacy policy<br>\n");
      out.write("                                                        </p>\n");
      out.write("                                                        <div class=\"subscribe-form form-default\">\n");
      out.write("                                                                <div class=\"row-subscibe\">\n");
      out.write("                                                                        <div class=\"input-group\">\n");
      out.write("                                                                                <input type=\"text\" class=\"form-control\" placeholder=\"Enter your e-mail\">\n");
      out.write("                                                                                <button type=\"submit\" class=\"btn\">JOIN US</button>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"checkbox-group\">\n");
      out.write("                                                                        <input type=\"checkbox\" id=\"checkBox1\">\n");
      out.write("                                                                        <label for=\"checkBox1\">\n");
      out.write("                                                                                <span class=\"check\"></span>\n");
      out.write("                                                                                <span class=\"box\"></span>\n");
      out.write("                                                                                Don’t Show This Popup Again\n");
      out.write("                                                                        </label>\n");
      out.write("                                                                </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                </div>\n");
      out.write("                                        </div>\n");
      out.write("                                </form>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        -->\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"/Store/js/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <script src=\"/Store/js/jquery-3.6.0.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"/Store/external/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"/Store/external/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"/Store/external/slick/slick.min.js\"></script>\n");
      out.write("    <script src=\"/Store/external/perfect-scrollbar/perfect-scrollbar.min.js\"></script>\n");
      out.write("    <script src=\"/Store/external/panelmenu/panelmenu.js\"></script>\n");
      out.write("    <script src=\"/Store/external/instafeed/instafeed.min.js\"></script>\n");
      out.write("    <script src=\"/Store/external/rs-plugin/js/jquery.themepunch.tools.min.js\"></script>\n");
      out.write("    <script src=\"/Store/external/rs-plugin/js/jquery.themepunch.revolution.min.js\"></script>\n");
      out.write("    <script src=\"/Store/external/countdown/jquery.plugin.min.js\"></script>\n");
      out.write("    <script src=\"/Store/external/countdown/jquery.countdown.min.js\"></script>\n");
      out.write("    <script src=\"/Store/external/lazyLoad/lazyload.min.js\"></script>\n");
      out.write("    <script src=\"/Store/js/main.js\"></script>\n");
      out.write("    <!-- form validation and sending to mail -->\n");
      out.write("    <script src=\"/Store/external/form/jquery.form.js\"></script>\n");
      out.write("    <script src=\"/Store/external/form/jquery.validate.min.js\"></script>\n");
      out.write("    <script src=\"/Store/external/form/jquery.form-init.js\"></script>\n");
      out.write("    <script >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        $('#quickView').on('show.bs.modal', function (event) {\n");
      out.write("            var button = $(event.relatedTarget)\n");
      out.write("            var id = button.data('idp')\n");
      out.write("            var modal = $(this)\n");
      out.write("\n");
      out.write("\n");
      out.write("            $.ajax({\n");
      out.write("                url: '/Store/LoadQuickViewData',\n");
      out.write("                type: 'GET',\n");
      out.write("                dataType: 'json',\n");
      out.write("                data: 'idp=' + id,\n");
      out.write("                success: function (data) {\n");
      out.write("                    $(\"#idp\").html(id);\n");
      out.write("                    $(\"#qtestock\").html(data.qtestock);\n");
      out.write("                    $(\"#libelle\").html(data.libelle);\n");
      out.write("                    $(\"#description\").html(data.description);\n");
      out.write("                    $(\"#marque\").html(data.marque);\n");
      out.write("                    $(\"#prix\").html(data.prix);\n");
      out.write("                    $(\"#categorie\").html(data.categorie);\n");
      out.write("                    $('#url').attr('src', '/Store/images/product/' + data.url);\n");
      out.write("                    $('#url2').attr('src', '/Store/images/product/' + data.url2);\n");
      out.write("                    console.log(data);\n");
      out.write("                },\n");
      out.write("                error: function (html, erreur, code) {\n");
      out.write("                    alert(erreur);\n");
      out.write("                }\n");
      out.write("            })\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}