package com.multilang.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Locale;

public class LanguageFilter implements Filter {

    public void init(FilterConfig filterConfig) {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession();

        String langParam = request.getParameter("lang");

        if (langParam != null && !langParam.isEmpty()) {
            Locale locale = toLocale(langParam);
            session.setAttribute("appLocale", locale);
        } else if (session.getAttribute("appLocale") == null) {
            Locale fallback = Locale.forLanguageTag("vi");
            session.setAttribute("appLocale", fallback);
        }

        chain.doFilter(request, response);
    }

    public void destroy() {}

    private Locale toLocale(String langParam) {
        if (langParam.contains("_")) {
            String[] parts = langParam.split("_");
            return new Locale(parts[0], parts[1]);
        }
        return Locale.forLanguageTag(langParam);
    }
}


