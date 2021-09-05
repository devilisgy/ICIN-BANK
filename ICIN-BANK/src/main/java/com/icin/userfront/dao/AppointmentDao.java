package com.icin.userfront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.icin.userfront.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
