package com.nttdata.product.app.ImplService;

import com.nttdata.product.app.document.VitualCoin;
import com.nttdata.product.app.repository.VirtualCoinRepository;
import com.nttdata.product.app.service.VirtualCoinService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class VirtualCoinServiceImpl implements VirtualCoinService {
    @Autowired
    private VirtualCoinRepository virtualCoinRepository;
    @Override
    public Mono<VitualCoin> findById(String id) {
        return virtualCoinRepository.findById(id);
    }

    @Override
    public Mono<VitualCoin> save(VitualCoin document) {
        return virtualCoinRepository.save(document);
    }

    @Override
    public Mono<Void> delete(VitualCoin document) {
        return virtualCoinRepository.delete(document);
    }

    @Override
    public Flux<VitualCoin> findAll() {

        return virtualCoinRepository.findAll();
    }

}
