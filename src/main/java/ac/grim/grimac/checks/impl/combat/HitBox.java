package ac.grim.grimac.checks.impl.combat;

import ac.grim.grimac.checks.Check;
import ac.grim.grimac.checks.CheckData;
import ac.grim.grimac.checks.type.PacketCheck;
import ac.grim.grimac.player.GrimPlayer;

@CheckData(name = "Hitbox", configName = "Hitbox")
public class HitBox extends Check implements PacketCheck {

    public HitBox(GrimPlayer player) {
        super(player);
    }

}
