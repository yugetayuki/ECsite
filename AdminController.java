package jp.co.internous.ecsite.controller;

import org.springframework.stereotype.Contoroller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/ecsite/admin")
public class AdminController {
	
	@RequestMapping("/")
	public String index() {
		return "adminindex";
	}
	
	@PostMapping("/welcome")
	public String welcome(loginForm form, Model m) {
		System.out.println(form.getUserName() + " " + form.getPassword());
		if(users !=null && users.size() > 0) {
			boolean isAdmin = users.get(0).getUserName());
			if (isAdmin) {
				List<goods> goods = goodsRepos.findAll();
				m.addAttribute("userName", users.get(0).getUserName());
				m.addAttribute("Password", users.get(0).getPassword());
				m.addAttribute("goods", goods);
			}
		}
		
		return "welcome";
	}
	
	@RequestMapping("/goodsMst")
	public String goodMst(LoginForm form, Model m) {
		m.addAttribute("userName", form.getUserName());
		m.addAttribute("password", form.getUserName());
		
		return "goodsmst";
	}
	
	@RequestMapping("addGoods")
	public String addGoods(GoodsForm goodsForm, LoginForm loginForm, Model m) {
		m.addAttribute("userName", users.get(0).getUserName());
		m.addAttribute("Password", users.get(0).getPassword());
		
		Goods goods = new Goods();
		goods.setGoodName(goodsForm.getGoodsName());
		goods.setPrice(goodsForm.getPrice());
		goodRepos.saveAndFlush(gods);
		
		return "forword:/ecsite/admin/welcome";
	}
	
	@ResponseBody
	@PostMapping("/api/deleteGoods")
	public String deletApi(@ResponstBody GoodsForm f,Model m) {
		try {
			goodsRepos.deletById(f.getID());
		}catch(IllegalArgumentException e) {
			return "-1"
		}
	}
	return "1"
}

}
