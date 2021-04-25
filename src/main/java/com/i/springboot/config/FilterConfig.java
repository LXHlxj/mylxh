package com.i.springboot.config;

import javax.servlet.*;
import java.io.IOException;
/*@Component
@WebFilter("/*")*/
public class FilterConfig implements Filter {

    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
   /*     HttpServletRequest servletRequest1 = (HttpServletRequest) servletRequest;
        HttpServletResponse servletResponse1 = (HttpServletResponse) servletResponse;
        servletRequest1.setCharacterEncoding("UTF-8");
        servletResponse1.setContentType("text/html,charset=UTF-8");
        try {
            HttpSession httpSession = servletRequest1.getSession();
            if (httpSession.getAttribute("name").equals("root")) {
                if (servletRequest1.getServletPath().endsWith(".css") || servletRequest1.getServletPath().endsWith(".js") || servletRequest1.getServletPath().endsWith("index.html")
                        || servletRequest1.getServletPath().endsWith("submit") || servletRequest1.getServletPath().endsWith(".jpg"))
                    filterChain.doFilter(servletRequest1, servletResponse1);
                servletRequest1.getRequestDispatcher("/guan.html").forward(servletRequest1, servletResponse1);
                return;
           *//* } catch (Exception e){
                    System.out.println("第一个："+e.getLocalizedMessage());*//*
            }

            servletResponse1.sendRedirect("index.html");
            filterChain.doFilter(servletRequest1, servletResponse1);
           *//* if (servletRequest1.getServletPath().endsWith(".css") || servletRequest1.getServletPath().endsWith(".js") || servletRequest1.getServletPath().endsWith("index.html")
                    || servletRequest1.getServletPath().endsWith("submit")||servletRequest1.getServletPath().endsWith(".jpg")) {
                filterChain.doFilter(servletRequest1,servletResponse1);
                try{
                    if (httpSession.getAttribute("name").equals("root")) {
                        try {
                            System.out.println("哈哈1" + httpSession.getAttribute("name"));
                              servletRequest1.getRequestDispatcher("/guan.html").forward(servletRequest1, servletResponse1);
                            return;
                        }catch (Exception e){
                            System.out.println("第2个："+e.getLocalizedMessage());
                        }
                    }
                }catch (Exception e){
                    System.out.println("第3个："+e.getLocalizedMessage());
                }
            }else
                servletResponse1.sendRedirect("index.html");
                System.out.println("没有登录");*//*
            *//*    catch (Exception e){*//*
       *//*     System.out.println("第一个："+e.getLocalizedMessage());
        }*//*
        }catch (Exception e){
        }*/
    }
    @Override
    public void destroy() {

        System.out.println("结束");
    }
}
