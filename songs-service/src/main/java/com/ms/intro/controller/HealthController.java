package com.ms.intro.controller;

import com.ms.intro.dao.SongRepo;
import com.ms.intro.domain.SongData;
import com.ms.intro.dto.IdDto;
import com.ms.intro.dto.SongDto;
import com.ms.intro.exceptions.DuplicatedResourceIdException;
import com.ms.intro.exceptions.InvalidIdsForDeletionException;
import com.ms.intro.exceptions.NotFoundSongDataException;
import com.ms.intro.mapper.SongDtoToDomainMapper;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping(path = "/health")
@AllArgsConstructor
public class HealthController {

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public String health() {
        return "Hello from the songs";
    }

}
