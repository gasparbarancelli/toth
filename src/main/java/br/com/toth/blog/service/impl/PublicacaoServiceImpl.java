package br.com.toth.blog.service.impl;

import br.com.toth.blog.model.Publicacao;
import br.com.toth.blog.repository.PublicacaoRepository;
import br.com.toth.blog.service.PublicacaoService;
import org.asciidoctor.Asciidoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.HashMap;

@Service
public class PublicacaoServiceImpl implements PublicacaoService {

    private final PublicacaoRepository publicacaoRepository;

    private final Asciidoctor asciidoctor;

    @Autowired
    public PublicacaoServiceImpl(PublicacaoRepository publicacaoRepository, Asciidoctor asciidoctor) {
        this.publicacaoRepository = publicacaoRepository;
        this.asciidoctor = asciidoctor;
    }

    @Override
    public Flux<Publicacao> findAllBy(Pageable pageable) {
        var options = new HashMap<String, Object>();

        return publicacaoRepository.findAllBy(pageable)
                .map(pub -> {
                    pub.setConteudo(asciidoctor.convert(pub.getConteudo(), options));
                    return pub;
                });
    }

}
