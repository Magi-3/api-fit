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
        model.addAttribute("apkUrl", "https://storage.cloud.google.com/appreactfit/Captura%20de%20tela%202024-04-24%20201610.png?_ga=2.134160014.-147884152.1718682549");        return "homepage";
    }
}
