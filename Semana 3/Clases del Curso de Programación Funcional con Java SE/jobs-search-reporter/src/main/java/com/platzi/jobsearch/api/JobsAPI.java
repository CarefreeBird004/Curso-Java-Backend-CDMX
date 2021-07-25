package com.platzi.jobsearch.api;

import com.platzi.jobsearch.JobPosition;
import feign.*;
import java.util.*;
/**
 * Esta interfaz sera usada por Feign para hacer las peticiones a la API de github.
 */
@Headers("Accept: application/json")
public interface JobsAPI {
    @RequestLine("GET /positions.json")
    List<JobPosition> jobs(@QueryMap Map<String, Object> queryMap);

    @RequestLine("GET /positions/{id}.json")
    JobPosition job(@Param("id") String id);
}
