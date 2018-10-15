package br.com.toth.blog.controller;

import br.com.toth.blog.model.Publicacao;
import br.com.toth.blog.service.PublicacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("publicacao")
public class PublicacaoController {

    @Autowired private PublicacaoService publicacaoService;

    @GetMapping
    public Flux<Publicacao> find(@RequestParam("page") int page, @RequestParam("size") int size) {
        var paginacao = PageRequest.of(page, size);
        return publicacaoService.find(paginacao);
    }

}
