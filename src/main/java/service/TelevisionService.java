package service;

import dtos.TelevisionDto;
import dtos.TelevisionInputDto;
import exceptions.RecordNotFoundException;
import models.Television;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import repositories.TelevisionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TelevisionService {

    private final TelevisionRepository televisionRepository;

    @Autowired
    public TelevisionService(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }


    public List<TelevisionDto> getAllTelevisions() {
        List<Television> tvList = televisionRepository.findAll();
        List<TelevisionDto> tvDtoList = new ArrayList<>();

        for (Television tv : tvList) {
            TelevisionDto dto = transferToDto(tv);
            tvDtoList.add(dto);
        }
        return tvDtoList;
    }

    public List<TelevisionDto> getAllTelevisionsByBrand(String brand) {
        List<Television> tvList = televisionRepository.findAllTelevisionsByBrandEqualsIgnoreCase(brand);
        List<TelevisionDto> tvDtoList = new ArrayList<>();

        for (Television tv : tvList) {
            TelevisionDto dto = transferToDto(tv);
            tvDtoList.add(dto);
        }
        return tvDtoList;
    }

    public TelevisionDto getTelevisionById(Long id) {

        if (televisionRepository.findById(id).isPresent()) {
            Television tv = televisionRepository.findById(id).get();
            return transferToDto(tv);

        } else {
            throw new RecordNotFoundException("geen tv gevonden");
        }
    }

    public TelevisionDto addTelevision(TelevisionInputDto dto) {

        Television tv = transferToTelevision(dto);
        televisionRepository.save(tv);

        return transferToDto(tv);
    }

    public void deleteTelevision(@RequestBody Long id) {

        televisionRepository.deleteById(id);
    }

    public TelevisionDto updateTelevision(Long id, TelevisionInputDto inputDto) {

        if (televisionRepository.findById(id).isPresent()) {

            Television tv = televisionRepository.findById(id).get();

            Television tv1 = transferToTelevision(inputDto);
            tv1.setId(tv.getId());

            televisionRepository.save(tv1);

            return transferToDto(tv1);

        } else {

            throw new RecordNotFoundException("geen televisie gevonden");

        }
    }

    public Television transferToTelevision(TelevisionInputDto dto) {
        var television = new Television();

        television.setName(dto.getName());
        television.setType(dto.getType());
        television.setBrand(dto.getBrand());
        television.setScreenType(dto.getScreenType());
        television.setScreenQuality(dto.getScreenQuality());
        television.setPrice(dto.getPrice());
        television.setAvailableSize(dto.getAvailableSize());
        television.setRefreshRate(dto.getRefreshRate());
        television.setSmartTv(dto.getSmartTv());
        television.setWifi(dto.getWifi());
        television.setVoiceControl(dto.getVoiceControl());
        television.setHdr(dto.getHdr());
        television.setBluetooth(dto.getBluetooth());
        television.setAmbiLight(dto.getAmbiLight());
        television.setOriginalStock(dto.getOriginalStock());
        television.setSold(dto.getSold());

        return television;
    }

    public TelevisionDto transferToDto(Television television) {
        TelevisionDto dto = new TelevisionDto();

        dto.setId(television.getId());
        dto.setName(television.getName());
        dto.setType(television.getType());
        dto.setBrand(television.getBrand());
        dto.setScreenType(television.getScreenType());
        dto.setScreenQuality(television.getScreenQuality());
        dto.setPrice(television.getPrice());
        dto.setAvailableSize(television.getAvailableSize());
        dto.setRefreshRate(television.getRefreshRate());
        dto.setSmartTv(television.getSmartTv());
        dto.setWifi(television.getWifi());
        dto.setVoiceControl(television.getVoiceControl());
        dto.setHdr(television.getHdr());
        dto.setBluetooth(television.getBluetooth());
        dto.setAmbiLight(television.getAmbiLight());
        dto.setOriginalStock(television.getOriginalStock());
        dto.setSold(television.getSold());

        return dto;
    }
}








