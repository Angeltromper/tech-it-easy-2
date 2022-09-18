package service;

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

    public TelevisionDto updateTelevision(Long id, TelevisionInpuDto inputDto) {

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

        television.setType(dto.getType());
        television.setBrand(dto.getBrand());
        television.setName(dto.getName());
        television.setPrice(dto.getPrice());
        television.setAvailableSize(dto.getAvailableSize());
        television.setRefreshRate(dto.getRefreshRate());
        television.setScreenType(dto.getSreenType());
        television.setScreenQuality(dto.getScreenQuality());
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
        TelevisonDto dto = new TelevisionDto();

        dto.setId(televison.getId());
        dto.setType(televison.getType());
        dto.setBrand(televison.getBrand());
        dto.setName(televison.getName());
        dto.setPrice(televison.getPrice());
        dto.setAvailableSize(televison.getAvailableSize());
        dto.setRefreshRate(television.getRefreshRate());
        dto.setScreenType(televison.getScreenType());
        dto.setSreenQuality(televison.getSreenQuality());
        dto.setSmartTv(televison.getSmartTv());
        dto.setWifi(televison.getWifi());
        dto.setVoiceControl(televison.getVoiceControl());
        dto.setHdr(televison.getHdr());
        dto.setBluetooth(televison.getBluetooth());
        dto.setAmbiLight(televison.getAmbiLight());
        dto.setOriginalStock(televison.getOriginalStock());
        dto.setSold(televison.getSold());

        return dto;


    }
}





}
