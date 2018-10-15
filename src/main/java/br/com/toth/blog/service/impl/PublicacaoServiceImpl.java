package br.com.toth.blog.service.impl;

import br.com.toth.blog.model.Publicacao;
import br.com.toth.blog.repository.PublicacaoRepository;
import br.com.toth.blog.service.PublicacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PublicacaoServiceImpl implements PublicacaoService {

    @Autowired private PublicacaoRepository publicacaoRepository;

    @Override
    public Flux<Publicacao> find(Pageable pageable) {
        return publicacaoRepository.findAllBy(pageable);
    }

}
