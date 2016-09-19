package com.actinver.controllers;

import com.actinver.models.Cliente;
import com.actinver.models.Conexion;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientesController {
    
    private JdbcTemplate jdbcTemplate;
                
    public ClientesController() {
        Conexion con = new Conexion();
        jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping("clientes.htm")
    public ModelAndView clientes(){
        ModelAndView mav = new ModelAndView();       
        String sql = "SELECT * FROM cliente";
        List datos = jdbcTemplate.queryForList(sql);
        mav.addObject("datos",datos);
        mav.setViewName("clientes");
        return mav;
    }
    
    @RequestMapping(value="clienteRegistrar.htm", method = RequestMethod.GET)
    public ModelAndView clienteAddForm(){
        return new ModelAndView("clienteRegistrar","command", new Cliente());
    }
    
    @RequestMapping(value="clienteRegistrar.htm", method = RequestMethod.POST)
    public ModelAndView clienteAddForm(Cliente cliente, ModelMap model){
        ModelAndView mav = new ModelAndView();
        model.addAttribute("nombre", cliente.getNombre());
        model.addAttribute("paterno", cliente.getPaterno());
        model.addAttribute("materno", cliente.getMaterno());       
        model.addAttribute("sexo", cliente.isSexo());
        model.addAttribute("estado", cliente.getEstado());         
        jdbcTemplate.update("INSERT INTO cliente VALUES(null,?,?,?,?,?)",cliente.getNombre(),cliente.getPaterno(),cliente.getMaterno(),cliente.isSexo(),cliente.getEstado());
        mav.setViewName("clienteSuccess");
        return mav;
    }    
    
    @RequestMapping(value = "clienteGetData.htm", method = RequestMethod.GET)
    public ModelAndView clienteGetData(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        String idCliente = request.getParameter("idCliente");
        mav.addObject("idCliente", idCliente);
        mav.setViewName("clienteGetData");
        return mav;
    }
    
    
    
}
