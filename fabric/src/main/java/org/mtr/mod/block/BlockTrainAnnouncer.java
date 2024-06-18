package org.mtr.mod.block;

import org.mtr.libraries.it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mapping.holder.CompoundTag;
import org.mtr.mapping.holder.PlayerEntity;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mod.BlockEntityTypes;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

public class BlockTrainAnnouncer extends BlockTrainSensorBase {

	@Nonnull
	@Override
	public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
		return new BlockEntity(blockPos, blockState);
	}

	public static class BlockEntity extends BlockEntityBase {

		private String message = "";
		private String soundId = "";
		private final Map<PlayerEntity, Long> lastAnnouncedMillis = new HashMap<>();
		private static final int ANNOUNCE_COOL_DOWN_MILLIS = 20000;
		private static final String KEY_MESSAGE = "message";
		private static final String KEY_SOUND_ID = "sound_id";

		public BlockEntity(BlockPos pos, BlockState state) {
			super(BlockEntityTypes.TRAIN_ANNOUNCER.get(), pos, state);
		}

		@Override
		public void readCompoundTag(CompoundTag compoundTag) {
			message = compoundTag.getString(KEY_MESSAGE);
			soundId = compoundTag.getString(KEY_SOUND_ID);
			super.readCompoundTag(compoundTag);
		}

		@Override
		public void writeCompoundTag(CompoundTag compoundTag) {
			compoundTag.putString(KEY_MESSAGE, message);
			compoundTag.putString(KEY_SOUND_ID, soundId);
			super.writeCompoundTag(compoundTag);
		}

		public void setData(LongAVLTreeSet filterRouteIds, boolean stoppedOnly, boolean movingOnly, String message, String soundId) {
			this.message = message;
			this.soundId = soundId;
			setData(filterRouteIds, stoppedOnly, movingOnly);
		}

		public String getMessage() {
			return message;
		}

		public String getSoundId() {
			return soundId;
		}

		public void announce(PlayerEntity player) {
			final long currentMillis = System.currentTimeMillis();
			if (!lastAnnouncedMillis.containsKey(player) || currentMillis - lastAnnouncedMillis.get(player) >= ANNOUNCE_COOL_DOWN_MILLIS) {
				lastAnnouncedMillis.put(player, System.currentTimeMillis());
				// TODO
			}
		}
	}
}
