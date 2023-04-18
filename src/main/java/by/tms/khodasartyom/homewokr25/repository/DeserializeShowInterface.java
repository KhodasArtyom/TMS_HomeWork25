package by.tms.khodasartyom.homewokr25.repository;

import by.tms.khodasartyom.homewokr25.model.Show;

import java.util.List;

public interface DeserializeShowInterface
{
    Show deserialize(List<Show> shows, String line);
}
