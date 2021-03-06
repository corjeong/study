package com.example.study.controller.api;

import com.example.study.controller.CrudController;
import com.example.study.ifs.CrudInterface;
import com.example.study.model.entity.Item;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.ItemApiRequest;
import com.example.study.model.network.response.ItemApiResponse;
import com.example.study.service.ItemApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/item")
@RequiredArgsConstructor
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse, Item> {

    /*  //BaseService Service 추상화
    private final ItemApiLogicService itemApiLogicService;

    @PostConstruct
    public void init(){        this.baseService = itemApiLogicService;    }
*/
    /*
    //abstract class CrudController<Req, Res> 사용

    @Override
    @PostMapping("")    // /api/item
    public Header<ItemApiResponse> create(@RequestBody Header<ItemApiRequest> request) {
        return itemApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}") // /api/item/1 ... 1000
    public Header<ItemApiResponse> read(@PathVariable Long id) {
        return itemApiLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<ItemApiResponse> update(@RequestBody Header<ItemApiRequest> request) {
        return itemApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return itemApiLogicService.delete(id);
    }
    */

}
