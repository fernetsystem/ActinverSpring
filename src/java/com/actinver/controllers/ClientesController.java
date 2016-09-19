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
}
