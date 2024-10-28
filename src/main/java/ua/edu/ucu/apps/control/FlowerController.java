package ua.edu.ucu.apps.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flower.Flower;
import ua.edu.ucu.apps.flower.FlowerColor;
import ua.edu.ucu.apps.flower.FlowerType;


@RestController
@RequestMapping("/flowers")
public class FlowerController {
    
    private static final double PRICE_BOUND = 100;
    private static final double LENGTH_BOUND = 50;

    // @Autowired
    // private FlowerService flowerService;

    @GetMapping
    public List<Flower> listFlowers() {
        Random rand = new Random();

        List<Flower> flowers = new ArrayList<>();

        flowers.add(new Flower(rand.nextDouble(PRICE_BOUND),
                    rand.nextDouble(LENGTH_BOUND),
                    FlowerColor.RED, FlowerType.TULIP));
        flowers.add(new Flower(rand.nextDouble(PRICE_BOUND),
                    rand.nextDouble(LENGTH_BOUND),
                    FlowerColor.RED, FlowerType.TULIP));
        flowers.add(new Flower(rand.nextDouble(PRICE_BOUND),
                    rand.nextDouble(LENGTH_BOUND),
                    FlowerColor.RED, FlowerType.TULIP));

        return flowers;
    }

}
