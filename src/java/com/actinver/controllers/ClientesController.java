    @RequestMapping("clientes.htm")
    public ModelAndView clientes(){
        ModelAndView mav = new ModelAndView();       
        String sql = "SELECT * FROM cliente";
        List datos = jdbcTemplate.queryForList(sql);
        mav.addObject("datos",datos);
        mav.setViewName("clientes");
        return mav;
    }
