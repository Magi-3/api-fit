package me.magi.fitcore.api.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/api/v1/pagina")
    public String showPage(Model model) {
        model.addAttribute("mensagem", "Olá, Mundo!");
        model.addAttribute("appName", "Fit Focus");
        model.addAttribute("description", "Baixe o nosso aplicativo de alimentos e aproveite as melhores ofertas e produtos frescos!");
        model.addAttribute("apkUrl", "/api/v1/download/apk/enzoInfo.ods");        return "homepage";
    }
}
